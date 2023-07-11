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

RPM_NAME = "python310-azure-ai-metricsadvisor-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "aea2f31b9f6a8fb1b6380d3ba46dc79e430ffb2d8a6944f65dc38a2a792a8c6c22bcee741c584c0241991c81ece2926b5fc46edf925a8f03dd6dff3ed3b16bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-metricsadvisor \
python310-azure-ai-metricsadvisor \
python3dist-azure-ai-metricsadvisor"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-core \
python310-msrest \
python310-six"

inherit rpm
