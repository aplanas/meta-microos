SUMMARY = "Vicious plugins for awesome"
DESCRIPTION = "Vicious is a modular widget library for the 'awesome' window manager, \
derived from the 'Wicked' widget library. It has some of the old \
Wicked widget types, a few of them rewritten, and a good number of new \
ones. \
 \
Vicious widget types are a framework for creating your own awesome \
widgets. Vicious contains modules that gather data about your system, \
and a few helper functions that make it easier to register timers, \
suspend widgets and so on. \
 \
For now Vicious doesn't depend on any third party Lua libraries, to \
make it easier to install and use. That means some system utilities \
are used instead, where available: \
 \
  - hddtemp        for the HDD Temperature widget type \
  - alsa-utils     for the Volume widget type \
  - wireless_tools for the Wireless widget type \
  - curl           for widget types accessing network resources"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "awesome-vicious-2.6.0-1.2.noarch.rpm"
RPM_HASH = "e5acb1897f06872598ad45a559f83be015483d575abeda813cde7460d66649d5f96f44c29d18b31755d3bee4a0d05b4ea8d1cb3fcf218c073563eccf2848d5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-vicious"

RDEPENDS:${PN} += "awesome"

inherit rpm
