SUMMARY = "Performs a speedtest"
DESCRIPTION = "Performs a speedtest."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-speedtest-2.1.5-3.3.noarch.rpm"
RPM_HASH = "25be9803e9e46fc45a17d064352e1965019c3046931de0e622fa035f74fa04672c908359b159e9268bccaaa0050c32a5fd4e496e693c8e7ff02b560468e10708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-speedtest"
RDEPENDS:${PN} += "bumblebee-status speedtest-cli"

inherit rpm
