SUMMARY = "Microsoft Azure bundle"
DESCRIPTION = "This is the Microsoft Azure bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide Microsoft Azure functionality. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-sdk-4.0.0-11.3.noarch.rpm"
RPM_HASH = "68bcd9071040144a02562a4e572adc9a9457ee914614e18b0cd801962e965e6f35acc27407e3e04153f9b34c24c8ff9105f1bee5466b43987744b4ef93fefbea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-azure-sdk"
RDEPENDS:${PN} += "python311-adal \
python311-applicationinsights \
python311-azure-agrifood-farming \
python311-azure-ai-anomalydetector \
python311-azure-ai-formrecognizer \
python311-azure-ai-language-conversations \
python311-azure-ai-language-questionanswering \
python311-azure-ai-metricsadvisor \
python311-azure-ai-nspkg \
python311-azure-ai-textanalytics \
python311-azure-ai-translation-document \
python311-azure-appconfiguration \
python311-azure-applicationinsights \
python311-azure-batch \
python311-azure-cognitiveservices-anomalydetector \
python311-azure-cognitiveservices-formrecognizer \
python311-azure-cognitiveservices-inkrecognizer \
python311-azure-cognitiveservices-knowledge-nspkg \
python311-azure-cognitiveservices-knowledge-qnamaker \
python311-azure-cognitiveservices-language-luis \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-language-spellcheck \
python311-azure-cognitiveservices-language-textanalytics \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-personalizer \
python311-azure-cognitiveservices-search-autosuggest \
python311-azure-cognitiveservices-search-customimagesearch \
python311-azure-cognitiveservices-search-customsearch \
python311-azure-cognitiveservices-search-entitysearch \
python311-azure-cognitiveservices-search-imagesearch \
python311-azure-cognitiveservices-search-newssearch \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-cognitiveservices-search-videosearch \
python311-azure-cognitiveservices-search-visualsearch \
python311-azure-cognitiveservices-search-websearch \
python311-azure-cognitiveservices-vision-computervision \
python311-azure-cognitiveservices-vision-contentmoderator \
python311-azure-cognitiveservices-vision-customvision \
python311-azure-cognitiveservices-vision-face \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-communication-administration \
python311-azure-communication-chat \
python311-azure-communication-email \
python311-azure-communication-identity \
python311-azure-communication-networktraversal \
python311-azure-communication-nspkg \
python311-azure-communication-phonenumbers \
python311-azure-communication-sms \
python311-azure-confidentialledger \
python311-azure-containerregistry \
python311-azure-core \
python311-azure-core-tracing-opencensus \
python311-azure-core-tracing-opentelemetry \
python311-azure-cosmos \
python311-azure-data-nspkg \
python311-azure-data-tables \
python311-azure-datalake-store \
python311-azure-digitaltwins-core \
python311-azure-eventgrid \
python311-azure-eventhub \
python311-azure-eventhub-checkpointstoreblob \
python311-azure-eventhub-checkpointstoreblob-aio \
python311-azure-functions-devops-build \
python311-azure-graphrbac \
python311-azure-identity \
python311-azure-iot-deviceupdate \
python311-azure-iot-nspkg \
python311-azure-keyvault \
python311-azure-keyvault-administration \
python311-azure-keyvault-certificates \
python311-azure-keyvault-keys \
python311-azure-keyvault-nspkg \
python311-azure-keyvault-secrets \
python311-azure-loganalytics \
python311-azure-media-videoanalyzer-edge \
python311-azure-messaging-webpubsubservice \
python311-azure-mgmt \
python311-azure-mgmt-appcontainers \
python311-azure-mgmt-confidentialledger \
python311-azure-mgmt-dnsresolver \
python311-azure-mgmt-dynatrace \
python311-azure-mgmt-nginx \
python311-azure-mgmt-scvmm \
python311-azure-mgmt-workloads \
python311-azure-mixedreality-authentication \
python311-azure-monitor \
python311-azure-monitor-ingestion \
python311-azure-monitor-query \
python311-azure-multiapi-storage \
python311-azure-nspkg \
python311-azure-purview-account \
python311-azure-purview-administration \
python311-azure-purview-catalog \
python311-azure-purview-scanning \
python311-azure-schemaregistry \
python311-azure-schemaregistry-avroserializer \
python311-azure-search-documents \
python311-azure-search-nspkg \
python311-azure-security-attestation \
python311-azure-servicebus \
python311-azure-servicefabric \
python311-azure-servicemanagement-legacy \
python311-azure-storage-blob \
python311-azure-storage-common \
python311-azure-storage-file \
python311-azure-storage-file-datalake \
python311-azure-storage-file-share \
python311-azure-storage-nspkg \
python311-azure-storage-queue \
python311-azure-synapse \
python311-azure-synapse-accesscontrol \
python311-azure-synapse-artifacts \
python311-azure-synapse-managedprivateendpoints \
python311-azure-synapse-monitoring \
python311-azure-synapse-nspkg \
python311-azure-synapse-spark \
python311-azure-template \
python311-msal \
python311-msal-extensions \
python311-msrest \
python311-msrestazure \
python311-pydocumentdb \
python311-uamqp"

inherit rpm
