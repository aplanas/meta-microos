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

RPM_NAME = "python311-azure-monitor-query-1.2.0-1.1.noarch.rpm"
RPM_HASH = "93167886b6d1e4f33e854a592030e40f53652dc8f7137e56472276e795818ffa7847a5d907193b9539174bf5d31efc3baf04c79de584e09a770d0acaea07d065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-monitor-query \
python311-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-core \
python311-azure-monitor-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
