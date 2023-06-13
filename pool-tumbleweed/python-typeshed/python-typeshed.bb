SUMMARY = "Static type information for python modules"
DESCRIPTION = "Typeshed models function types for the Python standard library \
and Python builtins, as well as third party packages. \
 \
This data can e.g. be used for static analysis, type checking or \
type inference. \
 \
This package stores the typedata in /usr/share/typeshed"
LICENSE = "Apache-2.0"

PV = "0.0.1+git.20200312.b44cd294"

RPM_NAME = "python-typeshed-0.0.1+git.20200312.b44cd294-1.9.noarch.rpm"
RPM_HASH = "3c6c332f7e5312af5cc479ce17a6a94149282a2f923eea609b181612aef946a62966114becf3ed612334effecd18066ca5b3335c96effc2db997d6c42e96940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-typeshed \
python2-typeshed \
python3-typeshed"

RDEPENDS:${PN} += ""

inherit rpm
