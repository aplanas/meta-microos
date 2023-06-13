SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-git-url-parse-1.2.2-1.14.noarch.rpm"
RPM_HASH = "96d97aab44f9dfe874e9fa9428e25bec37bd92c7f68856fd74106787eea34f327603875f482f2699146bd707697680f9024d0f494ce6952c44ea4e4192d09cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(git-url-parse) \
python311-git-url-parse \
python3dist(git-url-parse)"

RDEPENDS:${PN} += "python(abi) \
python311-pbr"

inherit rpm
