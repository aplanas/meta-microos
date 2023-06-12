SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python310-cppclean-0.13-2.18.noarch.rpm"
RPM_HASH = "bb8d2550398779ef5e0e3385175591f359742d580904ab079c54811961358f7df679b7e9d6b8b814bc69eee92700172482255b7e82168b2548d12468ffa7523f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cppclean \
python3.10dist(cppclean) \
python310-cppclean \
python3dist(cppclean)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
