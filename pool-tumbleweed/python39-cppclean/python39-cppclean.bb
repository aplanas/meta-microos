SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python39-cppclean-0.13-2.19.noarch.rpm"
RPM_HASH = "a077b22dc03d77b47b9a2e589818348a88d2d51cf9c98b519b5634c5150ca97a756cd760d7fe19dd7833c99577942d90c8495bf24bd7c8655d59bee5e0f0d2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cppclean \
python39-cppclean \
python3dist-cppclean"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
