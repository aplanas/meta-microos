SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-pulseaudio-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "f38430dba9c4a30ac8fa1a42e86f659eddee96b391e3571c0b895585c5472f1c3da560d38d320cb5e671d0ffac984b43e4265931b37bd197d334106aad413303"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
