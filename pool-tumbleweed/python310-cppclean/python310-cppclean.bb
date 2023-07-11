SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python310-cppclean-0.13-2.19.noarch.rpm"
RPM_HASH = "0c39925496e8e6c178a677438037fec46ec586dfafea81e1f93a60a25142326c20265af224f332a7015fcc8bd4e3f01506ebbe517d815fc1c6c9a29fb969af6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cppclean \
python310-cppclean \
python3dist-cppclean"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
