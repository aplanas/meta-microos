SUMMARY = "Provides access to repositories inside containers"
DESCRIPTION = "container-suseconnect gives access to package repositories inside containers \
using the host machine entitlements."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "container-suseconnect-2.4.0-1.5.aarch64.rpm"
RPM_HASH = "1f3c731942b2233cffe038537759ce933941754532dfa2279600ac25dc43dc1792bc0d4619ae86ae54bd668b514d9dfcffaf7f6ae8f5203a46c3968c4f9ad60c"

RPROVIDES:${PN} += "container-suseconnect"

RDEPENDS:${PN} += "libzypp"

inherit rpm
