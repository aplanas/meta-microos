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

RPM_NAME = "snmpsim-0.4.7-2.6.noarch.rpm"
RPM_HASH = "4062c945550eda04572864e0b0161d7c6819d148802433e0568f9200f17a430fd962de8d5ed2d502c20185f73b219f5a63435f02d5f1c7f7dc6647622bcea190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-snmpsim \
python3dist-snmpsim \
snmpsim"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbm \
python3-pysnmp"

inherit rpm
