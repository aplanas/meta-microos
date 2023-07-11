SUMMARY = "XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-api-0.1-27.7.noarch.rpm"
RPM_HASH = "e7db72f1c5634ad8ba47740eb9fa813b73780691f80d13d485b2eafcc360c82201bbb5a3507dbe3fbebd1b235063829d1a91f134e837e6a2738a68e3ebbe149c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-api"

RDEPENDS:${PN} += "xalan-j2"

inherit rpm
