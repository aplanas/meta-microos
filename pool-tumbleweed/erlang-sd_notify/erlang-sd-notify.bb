SUMMARY = "Erlang interface to systemd notify subsystem"
DESCRIPTION = "Erlang module for native access to the systemd-notify facilities."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "erlang-sd_notify-1.1-2.3.aarch64.rpm"
RPM_HASH = "fd2d5e70ace31846512d4a002435ca6c92feb5d5cebc52efc669060b9ee4602053657b9a674c43cce2dc3170270933061528667e505650545735b4bda8b0a9c7"

RPROVIDES:${PN} += "erlang-sd-notify"

RDEPENDS:${PN} += "erlang"

inherit rpm
