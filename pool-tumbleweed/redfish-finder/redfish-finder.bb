SUMMARY = "Utility for parsing smbios information and configuring canonical bmc access"
DESCRIPTION = "Scans Smbios information for type 42 management controller information, and uses \
that to configure the appropriate network interface so that the bmc is \
canonically accessible via the hostname redfish-localhost"
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "redfish-finder-0.4-4.6.noarch.rpm"
RPM_HASH = "be71d6a1e4e242ee717683279be2a70a11837c50fa9b7ab322e51ffe4fd4156540770c6d0e449ee02cebaa3a42e942eafacd0248beb35fb61f723a008e128106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redfish-finder"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
NetworkManager \
dmidecode \
python3"

inherit rpm
