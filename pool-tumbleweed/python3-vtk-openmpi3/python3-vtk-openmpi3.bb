SUMMARY = "Python bindings for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides python 3.x bindings for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "python3-vtk-openmpi3-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "138086f754e866b70a84d78cd11b2c7a59cd8d58ce5ccc2f95269383fe1130ede478591b7cfaf163fe58da3b76b93feeb80707eb6a874d30daedee6cc7414ee1"

RPROVIDES:${PN} += "libvtkCommonPython.so.1 \
libvtkFiltersPython.so.1 \
libvtkPythonContext2D.so.1 \
libvtkPythonInterpreter.so.1 \
libvtkWrappingPythonCore3.11.so.1 \
python3-vtk-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libvtk1-openmpi3 \
libvtkChartsCore.so.1 \
libvtkCommonColor.so.1 \
libvtkCommonComputationalGeometry.so.1 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkCommonMisc.so.1 \
libvtkCommonSystem.so.1 \
libvtkCommonTransforms.so.1 \
libvtkDomainsChemistry.so.1 \
libvtkDomainsChemistryOpenGL2.so.1 \
libvtkDomainsParallelChemistry.so.1 \
libvtkFiltersAMR.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersFlowPaths.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeneric.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersHybrid.so.1 \
libvtkFiltersHyperTree.so.1 \
libvtkFiltersImaging.so.1 \
libvtkFiltersModeling.so.1 \
libvtkFiltersParallel.so.1 \
libvtkFiltersParallelGeometry.so.1 \
libvtkFiltersParallelImaging.so.1 \
libvtkFiltersParallelMPI.so.1 \
libvtkFiltersParallelVerdict.so.1 \
libvtkFiltersPoints.so.1 \
libvtkFiltersProgrammable.so.1 \
libvtkFiltersSMP.so.1 \
libvtkFiltersSelection.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersStatistics.so.1 \
libvtkFiltersTexture.so.1 \
libvtkFiltersTopology.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkGeovisCore.so.1 \
libvtkIOAMR.so.1 \
libvtkIOAsynchronous.so.1 \
libvtkIOCGNSReader.so.1 \
libvtkIOCONVERGECFD.so.1 \
libvtkIOCesium3DTiles.so.1 \
libvtkIOChemistry.so.1 \
libvtkIOCityGML.so.1 \
libvtkIOCore.so.1 \
libvtkIOEnSight.so.1 \
libvtkIOExodus.so.1 \
libvtkIOExport.so.1 \
libvtkIOExportPDF.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOHDF.so.1 \
libvtkIOImage.so.1 \
libvtkIOImport.so.1 \
libvtkIOInfovis.so.1 \
libvtkIOLSDyna.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOMINC.so.1 \
libvtkIOMPIImage.so.1 \
libvtkIOMPIParallel.so.1 \
libvtkIOMovie.so.1 \
libvtkIONetCDF.so.1 \
libvtkIOOggTheora.so.1 \
libvtkIOPLY.so.1 \
libvtkIOParallel.so.1 \
libvtkIOParallelNetCDF.so.1 \
libvtkIOParallelXML.so.1 \
libvtkIOSQL.so.1 \
libvtkIOSegY.so.1 \
libvtkIOTecplotTable.so.1 \
libvtkIOVeraOut.so.1 \
libvtkIOVideo.so.1 \
libvtkIOXML.so.1 \
libvtkIOXMLParser.so.1 \
libvtkImagingColor.so.1 \
libvtkImagingCore.so.1 \
libvtkImagingFourier.so.1 \
libvtkImagingGeneral.so.1 \
libvtkImagingHybrid.so.1 \
libvtkImagingMath.so.1 \
libvtkImagingMorphological.so.1 \
libvtkImagingSources.so.1 \
libvtkImagingStatistics.so.1 \
libvtkImagingStencil.so.1 \
libvtkInfovisCore.so.1 \
libvtkInfovisLayout.so.1 \
libvtkInteractionImage.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkParallelCore.so.1 \
libvtkParallelMPI.so.1 \
libvtkParallelMPI4Py.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingContext2D.so.1 \
libvtkRenderingContextOpenGL2.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingHyperTreeGrid.so.1 \
libvtkRenderingImage.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkRenderingQt.so.1 \
libvtkRenderingSceneGraph.so.1 \
libvtkRenderingUI.so.1 \
libvtkRenderingVolume.so.1 \
libvtkRenderingVolumeOpenGL2.so.1 \
libvtkRenderingVtkJS.so.1 \
libvtkTestingRendering.so.1 \
libvtkViewsContext2D.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtksys.so.1 \
python3-mpi4py \
python3-numpy \
python3-qt5 \
vtk-openmpi3-qt"

inherit rpm
