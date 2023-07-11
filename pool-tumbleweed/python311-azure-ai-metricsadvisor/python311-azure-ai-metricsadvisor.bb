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

RPM_NAME = "python311-azure-ai-metricsadvisor-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "bedf705e790d30948ed16c1343144dee01adaa748c853af957866c113c92825414ed00eb334bb757aae913b9b23f5f1d2b0a82d5984e6cf9211c15891712c65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-metricsadvisor \
python3.11dist-azure-ai-metricsadvisor \
python311-azure-ai-metricsadvisor \
python3dist-azure-ai-metricsadvisor"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-core \
python311-msrest \
python311-six"

inherit rpm
