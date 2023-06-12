SUMMARY = "Boot server configurator"
DESCRIPTION = "Cobbler is a network install server. Cobbler supports PXE, ISO virtualized installs, and re-installing existing Linux \
machines. The last two modes use a helper tool, 'koan', that integrates with cobbler. Cobbler's advanced features \
include importing distributions from DVDs and rsync mirrors, kickstart templating, integrated yum mirroring, and \
built-in DHCP/DNS Management. Cobbler has a XML-RPC API for integration with other applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-3.3.3-1.1.noarch.rpm"
RPM_HASH = "e2a3ace2fd6bebc5fbb2d57216435f43138a86745f403a40b94eea0d2ab85d4020da52800c21fdbd7d4f025a907c295832fd7ce970f0e64015d694c22e0a0216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler cobbler-nsupdate config(cobbler) python3.10dist(cobbler) python3dist(cobbler)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /sbin/service /usr/bin/python3 apache2 apache2-mod_wsgi-python3 createrepo_c dosfstools fence-agents python(abi) python3-Cheetah3 python3-PyYAML python3-distro python3-dnspython python3-magic python3-netaddr python3-requests python3-schema rsync systemd tftp xorriso"

inherit rpm
