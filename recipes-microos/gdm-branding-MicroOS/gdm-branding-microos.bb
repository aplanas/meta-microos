SUMMARY = "The GNOME Display Manager -- openSUSE MicroOS default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the openSUSE default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "20190625"

RPM_NAME = "gdm-branding-MicroOS-20190625-1.10.noarch.rpm"
RPM_HASH = "f371dab0352bf3502a54411ba44fba62efdb1193dd91ceeeaef8764be1125509486520903175c8d0b2cd9f6ad073485766c2e6d37af0355e7bbf8c365259b719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gdm-branding-MicroOS) gdm-branding gdm-branding-MicroOS"
RDEPENDS:${PN} += "distribution-logos gdm"

inherit rpm
