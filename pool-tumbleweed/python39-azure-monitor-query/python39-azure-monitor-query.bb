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

RPM_NAME = "python39-azure-monitor-query-1.2.0-1.2.noarch.rpm"
RPM_HASH = "8b681b6a4c3638d12177c09fbee5c47c85a1354e790c89d359ec7295cf571537cafec70a01456d492b1e4a9cf8e61d84139deb7146405bc81c88abe885927f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-monitor-query \
python39-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-monitor-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
