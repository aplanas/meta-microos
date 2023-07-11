SUMMARY = "SNMP Agents simulator"
DESCRIPTION = "SNMP Simulator is a software that would act like a multitude of real \
physical devices from SNMP Manager's point of view. Simulator builds \
and uses a database of physical devices' SNMP footprints to respond \
like their real counterparts do. \
 \
Typical use case for this software starts with recording a snapshot \
of SNMP objects of donor agents into text files. Once you have your \
snapshots at hand, a simulator script could be run over the snapshots \
responding to SNMP queries in the same way as donor SNMP agents did \
at the time of recording. \
 \
Technically, SNMP Simulator is a multi-context SNMP agent. That means \
that it handles multiple sets of managed object all at once. \
Each device is simulated within a dedicated SNMP context."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "snmpsim-0.4.7-2.7.noarch.rpm"
RPM_HASH = "6bdd3286a53801cac0ce19e895a96aa290b1400ceb27bd688504d8efe4d10884774f24f39eb5eb44cd90bbf213f6e2729d93926c11aa44bc95ca29d025c077dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-snmpsim \
python3dist-snmpsim \
snmpsim"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbm \
python3-pysnmp"

inherit rpm
