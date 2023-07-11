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

RPM_NAME = "python311-azure-monitor-query-1.2.0-1.2.noarch.rpm"
RPM_HASH = "ad523d6bae384294d1c4d7afdaaae800664dacf22fde6b10137a57192716948ba757c719aef5266525413b9d8fccc0fd429dc6d0a9778767dcca4e3f7f3f40b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-query \
python3.11dist-azure-monitor-query \
python311-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-monitor-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
