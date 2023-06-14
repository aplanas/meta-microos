SUMMARY = "An OBS source service: Refreshs local patches"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It refreshes locals patches by using quilt."
LICENSE = "Apache-2.0"

PV = "0.3.9+git.1625238904.d59f20e"

RPM_NAME = "obs-service-refresh_patches-0.3.9+git.1625238904.d59f20e-2.6.noarch.rpm"
RPM_HASH = "1c813b86cb2fefc4a119caf44318617f02366865dc9bc9273f057b488168014b84c9fbf0b73e7b226b8666610132fe025e5a57325e834beabcf2f22fb58b4af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-refresh-patches"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
quilt"

inherit rpm
