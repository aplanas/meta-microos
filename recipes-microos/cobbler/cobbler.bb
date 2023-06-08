SUMMARY = "Boot server configurator"
DESCRIPTION = "Cobbler is a network install server. Cobbler supports PXE, ISO virtualized installs, and re-installing existing Linux \
machines. The last two modes use a helper tool, 'koan', that integrates with cobbler. Cobbler's advanced features \
include importing distributions from DVDs and rsync mirrors, kickstart templating, integrated yum mirroring, and \
built-in DHCP/DNS Management. Cobbler has a XML-RPC API for integration with other applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3.0+git.5c498dbf"

RPM_NAME = "cobbler-3.3.3.0+git.5c498dbf-2.3.noarch.rpm"
RPM_HASH = "a3128609aa707fe3aecff627b661a4b408b45cd368c3d4bf8dc62d6c21afe483e71ab18b82c317859b7d0590cbe640781d89bbbe220e6d80e8c6689b43693dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler cobbler-nsupdate config(cobbler) python3.10dist(cobbler) python3dist(cobbler)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /sbin/service /usr/bin/python3 apache2 apache2-mod_wsgi-python3 createrepo_c fence-agents python(abi) python3-Cheetah3 python3-PyYAML python3-distro python3-dnspython python3-magic python3-netaddr python3-requests python3-schema rsync systemd tftp xorriso"

inherit rpm
