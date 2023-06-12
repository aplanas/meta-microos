SUMMARY = "Microsoft Azure bundle"
DESCRIPTION = "This is the Microsoft Azure bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide Microsoft Azure functionality. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-sdk-4.0.0-11.3.noarch.rpm"
RPM_HASH = "5693b61fa1da3dedb1a087be09478d83bd7ebf9e5ec3d2d2b25569c5e6cbfeea4bbade0f04cd87e9fc509bd42248eb5f57a07987c51116f3e9de9761e67bd01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-azure-sdk"
RDEPENDS:${PN} += "python39-adal \
python39-applicationinsights \
python39-azure-agrifood-farming \
python39-azure-ai-anomalydetector \
python39-azure-ai-formrecognizer \
python39-azure-ai-language-conversations \
python39-azure-ai-language-questionanswering \
python39-azure-ai-metricsadvisor \
python39-azure-ai-nspkg \
python39-azure-ai-textanalytics \
python39-azure-ai-translation-document \
python39-azure-appconfiguration \
python39-azure-applicationinsights \
python39-azure-batch \
python39-azure-cognitiveservices-anomalydetector \
python39-azure-cognitiveservices-formrecognizer \
python39-azure-cognitiveservices-inkrecognizer \
python39-azure-cognitiveservices-knowledge-nspkg \
python39-azure-cognitiveservices-knowledge-qnamaker \
python39-azure-cognitiveservices-language-luis \
python39-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-language-spellcheck \
python39-azure-cognitiveservices-language-textanalytics \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-personalizer \
python39-azure-cognitiveservices-search-autosuggest \
python39-azure-cognitiveservices-search-customimagesearch \
python39-azure-cognitiveservices-search-customsearch \
python39-azure-cognitiveservices-search-entitysearch \
python39-azure-cognitiveservices-search-imagesearch \
python39-azure-cognitiveservices-search-newssearch \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-cognitiveservices-search-videosearch \
python39-azure-cognitiveservices-search-visualsearch \
python39-azure-cognitiveservices-search-websearch \
python39-azure-cognitiveservices-vision-computervision \
python39-azure-cognitiveservices-vision-contentmoderator \
python39-azure-cognitiveservices-vision-customvision \
python39-azure-cognitiveservices-vision-face \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-communication-administration \
python39-azure-communication-chat \
python39-azure-communication-email \
python39-azure-communication-identity \
python39-azure-communication-networktraversal \
python39-azure-communication-nspkg \
python39-azure-communication-phonenumbers \
python39-azure-communication-sms \
python39-azure-confidentialledger \
python39-azure-containerregistry \
python39-azure-core \
python39-azure-core-tracing-opencensus \
python39-azure-core-tracing-opentelemetry \
python39-azure-cosmos \
python39-azure-data-nspkg \
python39-azure-data-tables \
python39-azure-datalake-store \
python39-azure-digitaltwins-core \
python39-azure-eventgrid \
python39-azure-eventhub \
python39-azure-eventhub-checkpointstoreblob \
python39-azure-eventhub-checkpointstoreblob-aio \
python39-azure-functions-devops-build \
python39-azure-graphrbac \
python39-azure-identity \
python39-azure-iot-deviceupdate \
python39-azure-iot-nspkg \
python39-azure-keyvault \
python39-azure-keyvault-administration \
python39-azure-keyvault-certificates \
python39-azure-keyvault-keys \
python39-azure-keyvault-nspkg \
python39-azure-keyvault-secrets \
python39-azure-loganalytics \
python39-azure-media-videoanalyzer-edge \
python39-azure-messaging-webpubsubservice \
python39-azure-mgmt \
python39-azure-mgmt-appcontainers \
python39-azure-mgmt-confidentialledger \
python39-azure-mgmt-dnsresolver \
python39-azure-mgmt-dynatrace \
python39-azure-mgmt-nginx \
python39-azure-mgmt-scvmm \
python39-azure-mgmt-workloads \
python39-azure-mixedreality-authentication \
python39-azure-monitor \
python39-azure-monitor-ingestion \
python39-azure-monitor-query \
python39-azure-multiapi-storage \
python39-azure-nspkg \
python39-azure-purview-account \
python39-azure-purview-administration \
python39-azure-purview-catalog \
python39-azure-purview-scanning \
python39-azure-schemaregistry \
python39-azure-schemaregistry-avroserializer \
python39-azure-search-documents \
python39-azure-search-nspkg \
python39-azure-security-attestation \
python39-azure-servicebus \
python39-azure-servicefabric \
python39-azure-servicemanagement-legacy \
python39-azure-storage-blob \
python39-azure-storage-common \
python39-azure-storage-file \
python39-azure-storage-file-datalake \
python39-azure-storage-file-share \
python39-azure-storage-nspkg \
python39-azure-storage-queue \
python39-azure-synapse \
python39-azure-synapse-accesscontrol \
python39-azure-synapse-artifacts \
python39-azure-synapse-managedprivateendpoints \
python39-azure-synapse-monitoring \
python39-azure-synapse-nspkg \
python39-azure-synapse-spark \
python39-azure-template \
python39-msal \
python39-msal-extensions \
python39-msrest \
python39-msrestazure \
python39-pydocumentdb \
python39-uamqp"

inherit rpm
