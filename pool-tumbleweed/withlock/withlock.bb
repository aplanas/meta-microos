SUMMARY = "A locking wrapper script"
DESCRIPTION = "withlock is a locking wrapper script to make sure that some program isn't run \
more than once. It is ideal to prevent periodic jobs spawned by cron from \
stacking up. \
 \
The locks created are valid only while the wrapper is running, and thus will \
never require a cleanup, as after a reboot. Thus, the wrapper is safe and easy \
to use, and much better than implementing half-hearted locking within scripts."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "withlock-0.5-3.2.noarch.rpm"
RPM_HASH = "1d4382dbb672b9af5f900a8322582189775f1d0e8e36d518c309689523b6cc8644fec1a105e729e15977b1b3c36d1c36aef68cf336ab557a231465860a562234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "withlock"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3"

inherit rpm
