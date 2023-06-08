SUMMARY = "API Guardian Java annotation"
DESCRIPTION = "API Guardian indicates the status of an API element and therefore its \
level of stability as well.  It is used to annotate public types, \
methods, constructors, and fields within a framework or application in \
order to publish their API status and level of stability and to \
indicate how they are intended to be used by consumers of the API."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "apiguardian-1.0.0-2.6.noarch.rpm"
RPM_HASH = "f38ea6498195f44dbc982814ec61e611817a32297b6fd5f4e0c82235efe722dc08612dfafbbff7c8cc2a97da8a26f3bc4db368f76155500e8aaa7fc3565df04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian mvn(org.apiguardian:apiguardian-api) mvn(org.apiguardian:apiguardian-api:pom:) osgi(org.apiguardian)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
