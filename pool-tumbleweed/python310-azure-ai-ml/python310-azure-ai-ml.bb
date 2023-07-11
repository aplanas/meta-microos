SUMMARY = "Microsoft Azure Machine Learning Client Library for Python"
DESCRIPTION = "We are excited to introduce the public preview of Azure Machine Learning Python \
SDK v2. The Python SDK v2 introduces new SDK capabilities like standalone local \
jobs, reusable components for pipelines and managed online/batch inferencing. \
Python SDK v2 allows you to move from simple to complex tasks easily and \
incrementally. This is enabled by using a common object model which brings \
concept reuse and consistency of actions across various tasks. The SDK v2 shares \
its foundation with the CLI v2 which is currently in also in public preview. \
 \
This package has been tested with Python 3.6, 3.7, 3.8, 3.9 and 3.10."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python310-azure-ai-ml-1.8.0-1.3.noarch.rpm"
RPM_HASH = "39030ca59df88a7e6c54557ba586d4c9a9883cc2b3f084ae7094aa2ce7cc069ca54bbf3e5ec560352cb4b713d97bdf2115f3c59dbced0c25fdb08737664bb7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-ml \
python310-azure-ai-ml \
python3dist-azure-ai-ml"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-PyYAML \
python310-applicationinsights \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-azure-identity \
python310-azure-mgmt-core \
python310-azure-storage-blob \
python310-azure-storage-file-datalake \
python310-azure-storage-file-share \
python310-colorama \
python310-docker \
python310-isodate \
python310-jsonschema \
python310-marshmallow \
python310-msrest \
python310-pathspec \
python310-pydash \
python310-strictyaml \
python310-tqdm \
python310-typing-extensions"

inherit rpm
