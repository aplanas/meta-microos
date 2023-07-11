SUMMARY = "Boot server configurator"
DESCRIPTION = "Cobbler is a network install server. Cobbler supports PXE, ISO virtualized installs, and re-installing existing Linux \
machines. The last two modes use a helper tool, 'koan', that integrates with cobbler. Cobbler's advanced features \
include importing distributions from DVDs and rsync mirrors, kickstart templating, integrated yum mirroring, and \
built-in DHCP/DNS Management. Cobbler has a XML-RPC API for integration with other applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-3.3.3-1.2.noarch.rpm"
RPM_HASH = "a966d9b6c204a9fc7281385890c015261ad17c3b3401ab8869c4071d9303dd7c0ecf7fe216a652a1a1450f40d8244a09b26b30e7654012a850fa6c7ded5ad63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler \
cobbler-nsupdate \
config-cobbler \
python3.11dist-cobbler \
python3dist-cobbler"

RDEPENDS:${PN} += "/sbin/service \
/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
apache2 \
apache2-mod-wsgi-python3 \
createrepo-c \
dosfstools \
fence-agents \
python-abi \
python3-Cheetah3 \
python3-PyYAML \
python3-distro \
python3-dnspython \
python3-magic \
python3-netaddr \
python3-requests \
python3-schema \
rsync \
systemd \
tftp \
xorriso"

inherit rpm
