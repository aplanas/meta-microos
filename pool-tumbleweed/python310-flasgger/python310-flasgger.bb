SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.7.1"

RPM_NAME = "python310-flasgger-0.9.7.1-1.1.noarch.rpm"
RPM_HASH = "add51d0eaf4403b97dfc4dbe12c6f3c80ddaa1889e671c08eab373ff8dead5a2a63cb7268cc30005a046f96d0ca1cb7589ec5d62dda4cc093237320bac643b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flasgger \
python310-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-PyYAML \
python310-jsonschema \
python310-mistune \
python310-packaging \
python310-six"

inherit rpm
