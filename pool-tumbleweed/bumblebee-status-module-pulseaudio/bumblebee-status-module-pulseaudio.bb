SUMMARY = "Widget for pulseaudio"
DESCRIPTION = "Displays volume and mute status and controls for PulseAudio devices. \
Use wheel up and down to change volume, left click mutes, right click opens pavucontrol."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-pulseaudio-2.1.5-3.3.noarch.rpm"
RPM_HASH = "5ac202b867031e96b9b4b121e8d5ec2e74cbb3185f0e65c47f9d0c8553aca56fbb67ab51a47b51eaabeb6099fe9a829bcc5d497621a8c2f62bf0c7c455a46955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-pulseaudio"

RDEPENDS:${PN} += "bumblebee-status \
pavucontrol \
pulseaudio-utils"

inherit rpm
