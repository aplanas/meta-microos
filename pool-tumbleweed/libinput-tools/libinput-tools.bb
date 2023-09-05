SUMMARY = "Utilities to display libinput configuration"
DESCRIPTION = "This tool lists the locally recognised devices and their respective \
configuration options and configuration defaults."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "libinput-tools-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "d84a12b54ff8c4f18aa172fbd2fae33f60421fb5c4698b8445e19c528bcf36e561d5d2ac09111f5ea5b0f4c5e94eeb53a6da8ed2663a51f7a5904a56248d95d3"

RPROVIDES:${PN} += "libinput-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libinput.so.10 \
libudev.so.1 \
python3-libevdev"

inherit rpm
