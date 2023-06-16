SUMMARY = "Get performance data from sar"
DESCRIPTION = "This plug-in was written to get performance data from sar. It was developed for \
use with Zenoss but should work with other NRPE compatible NMS. \
 \
Example output: \
 \
check_sar_perf cpu \
sar OK| CPU=all user=59.90 nice=0.00 system=4.46 iowait=0.00 steal=0.00 \
  idle=35.64 \
 \
check_sar_perf disk sda \
sar OK| DEV=sda tps=0.00 rd_sec/s=0.00 wr_sec/s=0.00 avgrq-sz=0.00 \
  avgqu-sz=0.00 await=0.00 svctm=0.00 util=0.00"
LICENSE = "BSD-2-Clause"

PV = "0.1"

RPM_NAME = "monitoring-plugins-sar-perf-0.1-111.6.noarch.rpm"
RPM_HASH = "c92f7c50792acce281eef3cb4b5253b5af3b7e9a5bbdf6b27dc2daed30b70637b7ff895df97d2e761ef27eab799dbad455728116e1e59d5a8728f863d5024832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-sar-perf \
monitoring-plugins-sar-perf \
nagios-plugins-sar-perf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
python \
sysstat"

inherit rpm
