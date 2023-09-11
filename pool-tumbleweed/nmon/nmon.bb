SUMMARY = "Performance Monitor"
DESCRIPTION = "This systems administrator, tuner, benchmark tool gives you a huge amount of \
important performance information in one go. It can output the data in two ways \
 \
1. On screen (console, telnet, VNC, putty or X Windows) using curses for low \
   CPU impact which is updated once every two seconds. You hit single characters \
   on you keyboard to enable/disable the various sorts of data. \
   * You can display the CPU, memory, network, disks (mini graphs or numbers), \
     file systems, NFS, top processes, resources (Linux version & processors) \
     and on Power micro-partition information. \
2. Save the data to a comma separated file for analysis and longer term data \
   capture. \
   * Use this together with nmon Analyser Excel 2000 spreadsheet, which loads \
     the nmon output file and automatically creates dozens of graphs ready for \
     you to study or write performance reports. \
   * Filter this data, add it to a rrd database (using an excellent freely \
     available utility called rrdtool). This graphs the data to .gif or .png \
     files plus generates the webpage .html file and you can then put the \
     graphs directly on a website automatically on AIX with no need of a \
     Windows based machine. \
   * Directly put the data into a rrd database or other database for your own \
     analysis"
LICENSE = "GPL-3.0-only"

PV = "16p"

RPM_NAME = "nmon-16p-1.1.aarch64.rpm"
RPM_HASH = "068b5cd7767c7ac823937fc9d3dba740642eccbf32beaa19b9abcdaf2fda4e956017b31e7508aac4a0196ba8dd244e562a267c2686a3632d91affba76edf2e40"

RPROVIDES:${PN} += "lmon \
nmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
