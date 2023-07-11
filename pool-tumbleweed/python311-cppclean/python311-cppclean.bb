SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python311-cppclean-0.13-2.19.noarch.rpm"
RPM_HASH = "1a65ddfab6e175133e9a48ede169ada6d9f5fd0e185ce1b0ba458eaea5c86870537e18bb4e5bd963f88b0f919245a8effbae8750aa812847ffd12b24f6dcf6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cppclean \
python3.11dist-cppclean \
python311-cppclean \
python3dist-cppclean"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
