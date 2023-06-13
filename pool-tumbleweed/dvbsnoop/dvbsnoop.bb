SUMMARY = "DVB / MPEG stream analyzer program"
DESCRIPTION = "Its purpose is to debug, dump or view digital stream information (e.g. \
digital television broadcasts) send via satellite, cable or terrestrial. \
Streams can be SI, PES or TS. Basically you can describe dvbsnoop as a \
'swiss army knife' analyzing program for DVB, MHP, DSM-CC or MPEG - similar \
to TCP network sniffer programs like the old and famous snoop on Sun \
Solaris or tcpdump on Linux (which is in fact a kind of a clone of SunOS \
'snoop'). You may also analyze offline mpeg streams, e.g. stored on DVD or \
mpeg2 movie files."
LICENSE = "GPL-2.0+"

PV = "1.4.50"

RPM_NAME = "dvbsnoop-1.4.50-22.8.aarch64.rpm"
RPM_HASH = "42bd692b838a45b17804c56e8f5a017e2388333455e8297ec04bbb92b6a1c4c69bbb8cacf2cb824d86823734ef2eda73ba94b0fdec20c6c74c63ef4f7a8e807d"

RPROVIDES:${PN} += "dvbsnoop \
dvbsnoop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
