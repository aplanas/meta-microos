SUMMARY = "UsrMerge related scripts"
DESCRIPTION = "Scripts and data files related to UsrMerge \
(https://en.opensuse.org/openSUSE:Usr_merge). Normally not needd."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-84.87-5.16.aarch64.rpm"
RPM_HASH = "371b6ae0fff943348a6be3abd0e5968acb596d1cd7b4ccf0350d9a20b6b6d06ba892c253f83f68ad87b9fa7ba53f69fd3c0a7c3946169a0e55070fc331088c36"

RPROVIDES:${PN} += "compat-usrmerge"

RDEPENDS:${PN} += ""

inherit rpm
