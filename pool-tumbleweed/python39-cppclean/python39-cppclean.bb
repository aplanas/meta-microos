SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python39-cppclean-0.13-2.18.noarch.rpm"
RPM_HASH = "e4ec2e7049bc1b8a3970ce205ba7f2f1f22f819889db263fc7ca7d509e0ecd925896c02555d73316c5d381731299a3dd7884dfc5d40c87ba7f5eaca3537138a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cppclean \
python39-cppclean \
python3dist-cppclean"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
