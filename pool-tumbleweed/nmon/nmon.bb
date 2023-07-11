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

PV = "16n"

RPM_NAME = "nmon-16n-1.7.aarch64.rpm"
RPM_HASH = "45dcaba28ea1cfb00aa86576e65cde60ad513fa0bf98c481505c1ca8ccec9280bf6b4b14c8c2b7018a1cb6a95eeae9d60ff6e0b652dea4da81609064b85760c2"

RPROVIDES:${PN} += "lmon \
nmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
