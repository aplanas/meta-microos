SUMMARY = "Versatile vmstat, iostat and ifstat Replacement"
DESCRIPTION = "Dstat is a versatile replacement for vmstat, iostat, netstat and ifstat. \
Dstat overcomes some of their limitations and adds some extra features, \
more counters and flexibility. Dstat is handy for monitoring systems \
during performance tuning tests, benchmarks or troubleshooting. \
 \
Dstat allows you to view all of your system resources instantly, you \
can eg. compare disk usage in combination with interrupts from your \
IDE controller, or compare the network bandwidth numbers directly \
with the disk throughput (in the same interval). \
 \
Dstat gives you detailed selective information in columns and clearly \
indicates in what magnitude and unit the output is displayed. Less \
confusion, less mistakes."
LICENSE = "GPL-2.0-only"

PV = "0.7.4"

RPM_NAME = "dstat-0.7.4-5.8.noarch.rpm"
RPM_HASH = "82afd8b683a4359d17c211aab61968b4007c4730c348ed1991cb75259581b03863f269c27665725cf0b48e43652802a4c7fec003a3c1cbaf900bebf905cf6a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(dstat.desktop) \
dstat"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-curses \
python3-six"

inherit rpm
