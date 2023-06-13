SUMMARY = "Intel SINIT AC (Secure Inititalization Authenticated Code) modules"
DESCRIPTION = "intel-SINIT contains the binary modules required to utilize \
Intel Trusted Execution Technology (Intel TXT) to perform a measured \
and verified launch of an OS kernel/VMM. The SINIT modules are digitally \
signed by INTEL and perfors the initial steps during a trusted boot. Among \
these initial steps are measurements of the BIOS/firmware and system settings \
like ACPI tables. \
 \
A specific SINIT file tailored to your INTEL processor needs to be used. \
This package contains them all for your convenience."
LICENSE = "SUSE-Firmware"

PV = "2.3"

RPM_NAME = "intel-SINIT-2.3-88.8.noarch.rpm"
RPM_HASH = "683b07263635147f5f7b7849f4d79d33ed8c501e4ebf482ee4551d7ace913026f675d5075908dda6a8be84c8cf607597a12145bbc33825b7754d044f78bff653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intel-SINIT"

RDEPENDS:${PN} += ""

inherit rpm
