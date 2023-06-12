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

RPM_NAME = "python39-azure-monitor-query-1.2.0-1.1.noarch.rpm"
RPM_HASH = "4b9649ab08474c488120f3cd0eb6f61156375881165cb76ba8258b229ee204d7198cd77aeb7b9168d9002fe53a89fa517fca6c47c653da4eb6aa5ce77d93cbd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-monitor-query) \
python39-azure-monitor-query \
python3dist(azure-monitor-query)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-core \
python39-azure-monitor-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
