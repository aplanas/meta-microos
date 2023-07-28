SUMMARY = "Python interface to Kea DHCP server"
DESCRIPTION = "Python3 interface to ISC Kea DHCP server."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "python3-kea-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "860791f73290cf41653a328c45bf9cdc914f440da6f0474112a686a1e1beca3043c7dc0162a94f1d143bc8b927e66a005ba39b37bab6162eda8b72e6645f6bab"

RPROVIDES:${PN} += "python3-kea"

RDEPENDS:${PN} += "python-abi"

inherit rpm
