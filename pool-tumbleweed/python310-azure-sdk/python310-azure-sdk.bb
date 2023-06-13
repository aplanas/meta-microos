SUMMARY = "Microsoft Azure bundle"
DESCRIPTION = "This is the Microsoft Azure bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide Microsoft Azure functionality. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-sdk-4.0.0-11.3.noarch.rpm"
RPM_HASH = "eaced1b4d6a82eae53088b09fe112f910c50c8f7296b857f96ba8f8534c64991567ef6b9afa86597d074687a9a2c7d8cc417c30001f6ecdafac97d26959b3a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-azure-sdk"

RDEPENDS:${PN} += "python310-adal \
python310-applicationinsights \
python310-azure-agrifood-farming \
python310-azure-ai-anomalydetector \
python310-azure-ai-formrecognizer \
python310-azure-ai-language-conversations \
python310-azure-ai-language-questionanswering \
python310-azure-ai-metricsadvisor \
python310-azure-ai-nspkg \
python310-azure-ai-textanalytics \
python310-azure-ai-translation-document \
python310-azure-appconfiguration \
python310-azure-applicationinsights \
python310-azure-batch \
python310-azure-cognitiveservices-anomalydetector \
python310-azure-cognitiveservices-formrecognizer \
python310-azure-cognitiveservices-inkrecognizer \
python310-azure-cognitiveservices-knowledge-nspkg \
python310-azure-cognitiveservices-knowledge-qnamaker \
python310-azure-cognitiveservices-language-luis \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-language-spellcheck \
python310-azure-cognitiveservices-language-textanalytics \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-personalizer \
python310-azure-cognitiveservices-search-autosuggest \
python310-azure-cognitiveservices-search-customimagesearch \
python310-azure-cognitiveservices-search-customsearch \
python310-azure-cognitiveservices-search-entitysearch \
python310-azure-cognitiveservices-search-imagesearch \
python310-azure-cognitiveservices-search-newssearch \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-cognitiveservices-search-videosearch \
python310-azure-cognitiveservices-search-visualsearch \
python310-azure-cognitiveservices-search-websearch \
python310-azure-cognitiveservices-vision-computervision \
python310-azure-cognitiveservices-vision-contentmoderator \
python310-azure-cognitiveservices-vision-customvision \
python310-azure-cognitiveservices-vision-face \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-communication-administration \
python310-azure-communication-chat \
python310-azure-communication-email \
python310-azure-communication-identity \
python310-azure-communication-networktraversal \
python310-azure-communication-nspkg \
python310-azure-communication-phonenumbers \
python310-azure-communication-sms \
python310-azure-confidentialledger \
python310-azure-containerregistry \
python310-azure-core \
python310-azure-core-tracing-opencensus \
python310-azure-core-tracing-opentelemetry \
python310-azure-cosmos \
python310-azure-data-nspkg \
python310-azure-data-tables \
python310-azure-datalake-store \
python310-azure-digitaltwins-core \
python310-azure-eventgrid \
python310-azure-eventhub \
python310-azure-eventhub-checkpointstoreblob \
python310-azure-eventhub-checkpointstoreblob-aio \
python310-azure-functions-devops-build \
python310-azure-graphrbac \
python310-azure-identity \
python310-azure-iot-deviceupdate \
python310-azure-iot-nspkg \
python310-azure-keyvault \
python310-azure-keyvault-administration \
python310-azure-keyvault-certificates \
python310-azure-keyvault-keys \
python310-azure-keyvault-nspkg \
python310-azure-keyvault-secrets \
python310-azure-loganalytics \
python310-azure-media-videoanalyzer-edge \
python310-azure-messaging-webpubsubservice \
python310-azure-mgmt \
python310-azure-mgmt-appcontainers \
python310-azure-mgmt-confidentialledger \
python310-azure-mgmt-dnsresolver \
python310-azure-mgmt-dynatrace \
python310-azure-mgmt-nginx \
python310-azure-mgmt-scvmm \
python310-azure-mgmt-workloads \
python310-azure-mixedreality-authentication \
python310-azure-monitor \
python310-azure-monitor-ingestion \
python310-azure-monitor-query \
python310-azure-multiapi-storage \
python310-azure-nspkg \
python310-azure-purview-account \
python310-azure-purview-administration \
python310-azure-purview-catalog \
python310-azure-purview-scanning \
python310-azure-schemaregistry \
python310-azure-schemaregistry-avroserializer \
python310-azure-search-documents \
python310-azure-search-nspkg \
python310-azure-security-attestation \
python310-azure-servicebus \
python310-azure-servicefabric \
python310-azure-servicemanagement-legacy \
python310-azure-storage-blob \
python310-azure-storage-common \
python310-azure-storage-file \
python310-azure-storage-file-datalake \
python310-azure-storage-file-share \
python310-azure-storage-nspkg \
python310-azure-storage-queue \
python310-azure-synapse \
python310-azure-synapse-accesscontrol \
python310-azure-synapse-artifacts \
python310-azure-synapse-managedprivateendpoints \
python310-azure-synapse-monitoring \
python310-azure-synapse-nspkg \
python310-azure-synapse-spark \
python310-azure-template \
python310-msal \
python310-msal-extensions \
python310-msrest \
python310-msrestazure \
python310-pydocumentdb \
python310-uamqp"

inherit rpm
