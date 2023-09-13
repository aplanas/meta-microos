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

PV = "1.10.0"

RPM_NAME = "python311-azure-ai-ml-1.10.0-1.1.noarch.rpm"
RPM_HASH = "693cab4471fd12bd0b847daeb27de96e7f78398b9e3cdb474a946a02bd5b7e722685a0005f1e222146bff38c1cc86fdf8d9ad17d39412e88f820324b529395c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-ml \
python3.11dist-azure-ai-ml \
python311-azure-ai-ml \
python3dist-azure-ai-ml"

RDEPENDS:${PN} += "python-abi \
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
