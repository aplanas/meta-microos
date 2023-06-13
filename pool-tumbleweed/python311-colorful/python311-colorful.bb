SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-colorful-0.5.5-1.3.noarch.rpm"
RPM_HASH = "216365c0a5d097118e0b4cc415ac2744f8ae39e03799f2692d35c3bd5bfed471822991ed8c6e631014a4518a6f19dcf68646b1d162eb68c2345f3b2aa6cb3604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colorful) \
python311-colorful \
python3dist(colorful)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
