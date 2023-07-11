SUMMARY = "Microsoft Azure Metrics Advisor Client Library for Python"
DESCRIPTION = "Metrics Advisor is a scalable real-time time series monitoring, alerting, and root cause analysis platform. \
 \
Use Metrics Advisor to: \
 \
 * Analyze multi-dimensional data from multiple data sources \
 * Identify and correlate anomalies \
 * Configure and fine-tune the anomaly detection model used on your data \
 * Diagnose anomalies and help with root cause analysis"
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-ai-metricsadvisor-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "5bcc219e68f866ff8d6684a06be28210205bc594cf95a6b45e672f600a9a4879b4d1c2b32d11aabdd13938f3faa22711e44e15fbff7814a9737a6719a0216df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-metricsadvisor \
python39-azure-ai-metricsadvisor \
python3dist-azure-ai-metricsadvisor"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-core \
python39-msrest \
python39-six"

inherit rpm
