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

RPM_NAME = "dvbsnoop-1.4.50-22.9.aarch64.rpm"
RPM_HASH = "366974bb06ad1a6b011ab2e3e3b73ea9413085cc6de0a9060178080d3a11483c35fd711cdd2177dd0771e38620581aa6d9a995a3a8f2fb771325842cb6d2de52"

RPROVIDES:${PN} += "dvbsnoop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
