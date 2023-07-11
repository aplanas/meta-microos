SUMMARY = "Example scripts for squirrel"
DESCRIPTION = "Example scripts to show squirrel usage."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-examples-3.2-2.3.noarch.rpm"
RPM_HASH = "945ef2e89dc828620b660fb82602043d4c137bd6c0cf11e350c59d5849ad1ef58bea48907da112c8eb2cee3d77437c7394cdde187408acf9a76a97da0d93c597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-examples"

RDEPENDS:${PN} += ""

inherit rpm
