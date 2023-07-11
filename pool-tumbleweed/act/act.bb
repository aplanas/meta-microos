SUMMARY = "Run your GitHub Actions locally"
DESCRIPTION = "act helps you run your Github Actions locally."
LICENSE = "MIT"

PV = "0.2.45"

RPM_NAME = "act-0.2.45-1.2.aarch64.rpm"
RPM_HASH = "28de08a01c90e1f20f4ce7b34615ec1a26b0df2eb1cf268bc47b67bb047e4c326f4247efdabb02313bf161cb26f39721b7dcbb2c126e135e332b6047387e2c44"

RPROVIDES:${PN} += "act"

RDEPENDS:${PN} += "docker"

inherit rpm
