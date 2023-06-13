SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-vmware-20230604-1684.1.aarch64.rpm"
RPM_HASH = "cd40b8723bc7eb457fbd4f2daebaab28dcf0f2e801b0c2eb295f2148b9ccc6431d785e323f795d715d2437b501ae492efcb77454805d63a08b4369d015785cea"

RPROVIDES:${PN} += "flavor(appliance-vmware) \
openSUSE-release-appliance-vmware \
openSUSE-release-appliance-vmware(aarch-64) \
product_flavor() \
product_flavor(openSUSE)"

RDEPENDS:${PN} += ""

inherit rpm
