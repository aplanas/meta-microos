SUMMARY = "Instrumentation for DMTF SSH Service Profile."
DESCRIPTION = "Linux providers for instrumentation of DMTF SSH Service Profile (DSP \
1017) \
 \
 \
 \
Authors: \
-------- \
    Bart Whiteley \
    Norm Paxton \
    Mike Brasher"
LICENSE = "EPL-1.0"

PV = "1.0.0"

RPM_NAME = "sblim-cmpi-ssh_service_profile-1.0.0-60.13.aarch64.rpm"
RPM_HASH = "c599a7d103729030fd3a6dfad06d174d9d10d866b0adfb440bf55c38352db803b2a60c2c8f735455841fafd2ed11e75f667f034494c82c3d51600bf5c225d96f"

RPROVIDES:${PN} += "liblinux-sshserviceprovider.so.1 \
sblim-cmpi-ssh-service-profile"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
cim-schema \
libc.so.6 \
libkonkret.so.0 \
libsblim-cmpiutil.so.1 \
sblim-cmpi-base \
sblim-sfcb"

inherit rpm
