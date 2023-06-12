SUMMARY = "Check operability of computer hardware and find drivers"
DESCRIPTION = "A tool to check operability of computer hardware and upload result \
to the Linux hardware database. \
 \
Probe — is a snapshot of your computer hardware state and system \
logs. The tool checks operability of devices by analysis of logs \
and returns a permanent url to view the probe of the computer. \
 \
The tool is intended to simplify collecting of logs necessary for \
investigating hardware related problems. Just run one simple \
command in the console to check your hardware and collect all the \
system logs at once: \
 \
    sudo -E hw-probe -all -upload \
 \
By creating probes you contribute to the HDD/SSD Real-Life \
Reliability Test study: https://github.com/linuxhw/SMART"
LICENSE = "LGPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "hw-probe-1.6-1.1.noarch.rpm"
RPM_HASH = "07546134aa8a7f9daaf40f493799a193686f128881bd5ac91fb178b62eb70078e594eaf7040cf3449cb7dc3e051a229cd79d933327f1c66d762b3d3d9fb0a350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hw-probe"
RDEPENDS:${PN} += "/usr/bin/perl \
acpica \
curl \
dmidecode \
hdparm \
hwinfo \
lsb-release \
pciutils \
perl-libwww-perl \
sensors \
smartmontools \
sysstat \
usbutils \
util-linux"

inherit rpm
