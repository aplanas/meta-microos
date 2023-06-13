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

PV = "1.7.2"

RPM_NAME = "python311-azure-ai-ml-1.7.2-1.1.noarch.rpm"
RPM_HASH = "0e53362ea686781705f71774a9da12eb1640ab6c0c5030be156a55eaf3292a89161ae4452d0ca04f04895234713f20e479d6fac4e140a4d938c2079bc8463286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-ml) \
python311-azure-ai-ml \
python3dist(azure-ai-ml)"

RDEPENDS:${PN} += "python(abi) \
python311-PyJWT \
python311-PyYAML \
python311-applicationinsights \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-azure-identity \
python311-azure-mgmt-core \
python311-azure-storage-blob \
python311-azure-storage-file-datalake \
python311-azure-storage-file-share \
python311-colorama \
python311-docker \
python311-isodate \
python311-jsonschema \
python311-marshmallow \
python311-msrest \
python311-pathspec \
python311-pydash \
python311-strictyaml \
python311-tqdm \
python311-typing-extensions"

inherit rpm
