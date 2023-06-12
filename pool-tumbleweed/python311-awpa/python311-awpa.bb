SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python311-awpa-0.19.1.0-1.18.noarch.rpm"
RPM_HASH = "9654f263a4797bd10ce815634edf3dbf026828205637cff1d3bb91303469c9194515f17b5ffb97918a7a3242d868b8cafb8e096ce93e1560e11147fe2525395d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(awpa) \
python311-awpa \
python3dist(awpa)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
