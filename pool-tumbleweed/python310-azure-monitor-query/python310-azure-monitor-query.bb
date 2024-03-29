SUMMARY = "Microsoft Azure Azure Monitor Query Client Library for Python"
DESCRIPTION = "Azure Monitor helps you maximize the availability and performance of your applications and \
services. It delivers a comprehensive solution for collecting, analyzing, and acting on \
telemetry from your cloud and on-premises environments. \
 \
All data collected by Azure Monitor fits into one of two fundamental types, metrics and logs. \
Metrics are numerical values that describe some aspect of a system at a particular point in \
time. They are lightweight and capable of supporting near real-time scenarios. Logs contain \
different kinds of data organized into records with different sets of properties for each \
type. Telemetry such as events and traces are stored as logs in addition to performance data \
so that it can all be combined for analysis."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-monitor-query-1.2.0-1.2.noarch.rpm"
RPM_HASH = "10b022e7850ec8a26b0d6046f4e56b4a45330c15d82d9c02703b438bf37a242a4dcda6378c7169547da70248c24b9748e5a70ff9eb03caa7eacfbaffde8aac42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-monitor-query \
python310-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-monitor-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
